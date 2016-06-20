"use strict";var portalApp=angular.module("portalApp",["ngAnimate","ngCookies","ngResource","ngRoute","ngSanitize","ngTouch","ui.router"]),GLOBAL_ENV={a:"http://localhost:8080/rest/"};portalApp.config(function(a,b){b.otherwise("home",{b:"views/home.html",c:"HomeCtrl",d:"home",e:"/home"}),a.f("home",{e:"/home",b:"views/home.html",c:"HomeCtrl",d:"home"}).f("products",{e:"/products",b:"views/products/products.html",c:"ProductsCtrl",d:"products"}).f("lab",{e:"/lab",b:"views/lab/lab.html",c:"LabCtrl",d:"lab"}).f("lab.all",{e:"/all",b:"views/lab/all.html"}).f("lab.ec2",{e:"/ec2",b:"views/lab/ec2.html"}).f("lab.cloudwatch",{e:"/cloudwatch",b:"views/lab/cloudwatch.html",c:"CloudWatchCtrl",d:"cloudwatch"}).f("articles",{e:"/articles",b:"views/articles/articles.html",c:"ArticlesCtrl",d:"articles"}).f("about",{e:"/about",b:"views/about/about.html",c:"AboutCtrl",d:"about"})}),angular.module("portalApp").c("NavController",function(a,b){a.g=b.h,a.i=b.j}),angular.module("portalApp").c("HomeCtrl",function(a,b){a.g=b.h,a.i=b.j,a.k=[{l:"cloud",m:"Cloud Computing",n:"In this module, it contains: <i>some</i> architecture and best practise about aws, ali-cloud.i also include some related articles and code projects.i will put everything related to cloudin there."},{l:"bigdata",m:"Big Data",n:"In this module, it contains some big data frameworks, such as hadoop, spark. i also put algorithms whichbelongs to basic algorithm and big data algorithms in this module."},{l:"products",m:"My Products",n:"In this module, it contains products that i have done in my free time, i will put the code and screenshotin there to share with others if possible. also some products that i want to build."}]}),angular.module("portalApp").c("LabCtrl",function(a,b){}).c("CloudWatchCtrl",function(a,b,c){const d="cloud/cloudwatch/";a.o=[{}],c.p(GLOBAL_ENV.a+d+"alarms").then(function(b){console.log(b),b||b.length||(a.o=b)})}),angular.module("portalApp").c("ProductsCtrl",function(a,b){}),angular.module("portalApp").directive("portalHeaderTrans",function(){return{q:"A",r:function(a,b){var c=b.find(".dropdown button"),d=b.find(".dropdown ul");c.bind("click",function(a){d.slideToggle(),a.stopPropagation()})},b:"../../../views/common/nav.html"}}),angular.module("portalApp").directive("portalFooter",function(){return{q:"A",b:"../../../views/common/footer.html"}}),portalApp.service("CommonService",function(a){return{p:function(b){return a({s:"GET",e:b})}}}),angular.module("portalApp").value("messageCN",{h:[{t:"Home",f:"home"},{t:"Products",f:"products"},{t:"Lab",f:"lab"},{t:"Articles",f:"articles"},{t:"About me",f:"about"}],j:[{l:"QQ",m:"qq",u:"../images/qq.png"},{l:"WeChat",m:"wechat",u:"../images/wechat.png"}]});