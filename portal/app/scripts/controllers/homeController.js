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
                name: "operator",
                title: "My Title",
                desc: "This area is 100% editable and can be used to promote your products and services.  " +
                    "This area is 100% editable and can be used to promote your products and services."
            },
            {
                name: "software",
                title: "My Title",
                desc: "This area is 100% editable and can be used to promote your products and services.  " +
                    "This area is 100% editable and can be used to promote your products and services."
            },
            {
                name: "calculator",
                title: "My Title",
                desc: "This area is 100% editable and can be used to promote your products and services.  " +
                    "This area is 100% editable and can be used to promote your products and services."
            }
        ]
    });
