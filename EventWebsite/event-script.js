var app = angular.module("eventListApp", []);
app.controller("eventListController", function($scope, $http) {

    $http({
        method: "GET",
        url: "events.csv",
    }).then(function processData(response) {
        $scope.events = response.data.split(/\r\n|\n/);

    }, function error(response) {
        console.log("Error");
    });

    
});
