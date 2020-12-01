new Vue({
    el:".login_box",
    data:
        {currentIndex:0,
            loginWay:["账号密码登录","手机短信登录"],
            wechatLogin:!0,
            accountLogin:!1,
            messageLogin:!1,
            userName:"",
            password:"",
            mobile:"",
            verifyCode:"",
            picVerifyCode:"",
            sendAuthCode:!0,
            auth_time:60,
            key:"",
            qrCode:"",
            timequ:null,
            qqCode:"",
            picVerifyCodeUrl:"",
            id:""
        },
    watch:
        {messageLogin:
                function(t,e){t&&this.getPicCode()}},
    methods:
        {getQrCode:function(){
            var t=zto.thirdParty.setState("wechatWebZtoExpress","auth"),
                e=window.location.origin+"/public/html/thirdpartycallback/index.html";new WxLogin({self_redirect:!1,id:"wechat_login_container",
                    appid:zto.config.wechatWebAppId,scope:"snsapi_login",
                    redirect_uri:e,state:t,style:"black",
                    href:"https://libs.zto.cn/app/auth/css/wechat-qrcode.css"})},

            accountLoginWay:function(){if(!accountLoginCheck())return!1;
            zto.services.loginByPassword({
                userName:this.userName,
                password:this.password,isAgainBind:!1}).then(function(t){
                    if(!0===t.data.status){var e=t.data.result.token;zto.auth.setToken(e),zto.utils.goRedirectUri(e)}
                    else $(".account_login_tips").text(t.data.message).show()}).catch(
                        function(){})},getPicCode:function(){var e=this;zto.services.image().then(function(t){!0===t.data.status&&(e.picVerifyCodeUrl=t.data.result.image,e.id=t.data.result.id)}).catch(function(){})},getAuthCode:function(){var i=this;if(!getLoginCode())return!1;zto.services.smsVerifyCode({mobile:i.mobile},{"x-captcha-id":i.id,"x-captcha-code":i.picVerifyCode}).then(function(t){if(!0===t.data.status){i.sendAuthCode=!1,i.auth_time=60,i.getPicCode();var e=setInterval(function(){i.auth_time--,i.auth_time<=0&&(i.sendAuthCode=!0,clearInterval(e))},1e3)}else error_show(t.data.message)}).catch(function(){})},messageLoginWay:function(){if(!messageLoginCheck())return!1;zto.services.loginOrRegister({mobile:this.mobile,verifyCode:this.verifyCode,isAgainBind:!1}).then(function(t){if(!0===t.data.status){success_show(t.data.message);var e=t.data.result.token;zto.auth.setToken(e),zto.utils.goRedirectUri(e)}else $(".message_login_tips").text(t.data.message).show()}).catch(function(){})},switchTab:function(t){var e=this;0===(e.currentIndex=t)?(e.wechatLogin=!0,e.accountLogin=!1,e.messageLogin=!1,e.getQrCode()):1===t?(e.wechatLogin=!1,e.accountLogin=!0,e.messageLogin=!1):2===t&&(e.wechatLogin=!1,e.accountLogin=!1,e.messageLogin=!0)},qqLogin:function(){var t=zto.thirdParty.setState("qqWebZtoExpress","auth"),
                e=window.location.origin+"/public/html/thirdpartycallback/index.html",
                i="https://graph.qq.com/oauth2.0/authorize?response_type=code&client_id="
                    +zto.config.qqConnectAppId+"&redirect_uri="+e+"&state="+t;
                window.location.href=i}},
    mounted:function(){this.getQrCode()}});