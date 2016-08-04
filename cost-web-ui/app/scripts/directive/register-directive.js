'use strict';
angular.module('costAnalysisApp')
  .directive('registerDirective',
    function () {
      return {
        restrict: 'E',
        templateUrl: '../../views/template/register-page.html',
        controller: ['$scope', '$attrs', 'registerDirective',
          function ($scope, $attrs, registerDirective) {
            $scope.user = {
              username: '',
              password: ''
            };
            $scope.register = registerDirective.register;
          }]
      };
    });
