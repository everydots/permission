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
            {name: "QQ", title: "qq", src: "../images/aa.png"},
            {name: "WeChat", title: "wechat", src: "../images/wechat.png"},
            {name: "Facebook", title: "facebook", src: "../images/facebook.png"},
            {name: "google+", title: "google+", src: "../images/google_plus.png"}
        ]
    });