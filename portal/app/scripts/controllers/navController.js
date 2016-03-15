'use strict';

/**
 * @ngdoc function
 * @name portalApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the portalApp
 */
angular.module('portalApp')
  .controller('NavController', function ($scope) {
    $scope.products = [
      "Permission", "SCM"
    ]
  });
