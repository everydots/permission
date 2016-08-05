'use strict';
angular.module('costAnalysisApp')
    .directive('loginPageDirective',
    function () {
        return {
            restrict: 'E',
            templateUrl: '../../views/template/login-page.html',
            controller: ['$scope', '$attrs', '$location', 'loginPageService',
                function ($scope, $attrs, $location, loginPageService) {
                    $scope.user = {
                        username: '',
                        password: '',
                        isRemember: false
                    };
                    $scope.login = function (user) {
                        loginPageService.login(user)
                            .then(function (result) {
                                if (result) {
                                    $location.path("main");
                                }
                            });
                    }
                }]
        };
    });
