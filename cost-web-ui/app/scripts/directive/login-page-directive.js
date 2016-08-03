'use strict';
angular.module('costAnalysisApp')
    .directive('loginPageDirective',
    function () {
        return {
            restrict: 'E',
            templateUrl: '../../views/template/login-page.html',
            controller: ['$scope', '$attrs', 'loginPageService',
                function ($scope, $attrs, loginPageService) {
                    $scope.user = {
                        username: '',
                        password: '',
                        isRemember: false
                    };
                    $scope.login = loginPageService.login;
                }]
        };
    });
