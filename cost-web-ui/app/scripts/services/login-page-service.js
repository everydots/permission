'use strict';
angular.module('costAnalysisApp')
    .service('loginPageService', function ($http, Constants) {
        return {

            login: function (user) {
                return $http({
                    method: 'POST',
                    data: user,
                    url: Constants.SERVICE_URLS.LOGIN_URL
                });
            }
        };
    });
