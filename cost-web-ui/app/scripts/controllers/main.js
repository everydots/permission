'use strict';

/**
 * @ngdoc function
 * @name stockWebUiApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the stockWebUiApp
 */
angular.module('costAnalysisApp')
  .controller('MainCtrl', ['$scope', '$cookieStore', function ($scope, $cookieStore) {
    $scope.getLoginState = function () {
      return $cookieStore.get('isLogged');
    };
    $scope.clearLoginState = function () {
      return $cookieStore.remove('isLogged');
    }
  }]);
