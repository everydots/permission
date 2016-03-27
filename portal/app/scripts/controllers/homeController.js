'use strict';

/**
 * @ngdoc function
 * @name portalApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the portalApp
 */
angular.module('portalApp')
    .controller('HomeCtrl', function ($scope, messageCN) {
        $scope.navItems = messageCN.nav_items;
        $scope.navIcons = messageCN.nav_icons;

        $scope.products = [
            {
                name: "cloud",
                title: "Cloud Computing",
                desc: "In this module, it contains: <i>some</i> architecture and best practise about aws, ali-cloud." +
                    "i also include some related articles and code projects.i will put everything related to cloud" +
                    "in there."
            },
            {
                name: "bigdata",
                title: "Big Data",
                desc: "In this module, it contains some big data frameworks, such as hadoop, spark. i also put algorithms which" +
                    "belongs to basic algorithm and big data algorithms in this module."
            },
            {
                name: "products",
                title: "My Products",
                desc: "In this module, it contains products that i have done in my free time, i will put the code and screenshot" +
                    "in there to share with others if possible. also some products that i want to build."
            }
        ]
    });
