'use strict';

var app = angular.module('app', [ 'ngResource' ]);

app.factory('RemminaService', function($resource) {
    return function(url, call) {
        return $resource(url, {}, {
            changeSource: {method: 'POST'}
        });
    };
});

app.controller('MainController', function($scope, RemminaService) {
    $scope.sources = RemminaService('/status').get();
    $scope.connect = function(source) {
        RemminaService('/' + source).changeSource().$promise.then(function() {
            $scope.sources = RemminaService('/status').get();
        });
    };
});

app.filter('title', function() {
   	return function(input, plural) {
   	    if (input != null) {
   	        var value = input[0].toUpperCase() + input.slice(1);
   	        if (plural) {
   	            value = value + 's';
   	        }
   	        return value
   	    }
   	    return input && input[0].toUpperCase() + input.slice(1);
   	}
});
