'use strict';
costAnalysisApp
  .service('loginService', function ($http, $cookieStore, Constants) {
    return {
      login: function (user) {
        return $http({
          method: 'POST',
          data: user,
          url: Constants.SERVICE_URLS.LOGIN_URL
        });
      },
      setUserInfoInCookie: function (user) {
        $cookieStore.put('username', user.username);
        $cookieStore.put('password', user.password);
        $cookieStore.put('isRemember', user.isRemember);
      },
      removeUserInfoInCookie: function () {
        $cookieStore.remove('username');
        $cookieStore.remove('password');
        $cookieStore.remove('isRemember');
      }
    };
  });
