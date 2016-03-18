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
    });
