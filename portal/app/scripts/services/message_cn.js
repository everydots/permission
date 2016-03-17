angular.module("portalApp")
    .value("messageCN", {
        nav_items: [
            {text: "Home", url: "home"},
            {text: "Products", url: "products"},
            {text: "Lab", url: "lab"},
            {text: "Articles", url: "articles"},
            {text: "About me", url: "about"}
        ],
        nav_icons: [
            {name: "QQ", title: "qq", src: "../images/qq.png"},
            {name: "WeChat", title: "wechat", src: "../images/wechat.png"}
        ]
    });