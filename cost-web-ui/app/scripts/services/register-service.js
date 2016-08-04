'use strict';
angular.module('costAnalysisApp')
  .service('registerDirective', function ($http, Constants) {
    return {
      register: function (user) {
        return $http({
          method: 'POST',
          data: user,
          url: Constants.SERVICE_URLS.REGISTER
        });
      }
    };
  });
