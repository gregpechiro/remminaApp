<!doctype html>
<html lang="en" ng-app="app">
	<head>
		<title>Remmina</title>
		<meta charset="utf-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no"/>
		<!--[if lt IE 9]><script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
		<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
		<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.3.4/angular.js"></script>
		<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.3.4/angular-resource.js"></script>
		<script src="/static/js/app.js"></script>
	</head>
	<body>
		<br/><br/>
		<div class="container" ng-controller="MainController">
			<div class="row">
				<div class="col-sm-12">
					<button ng-repeat="(k, v) in sources" class="btn btn-block btn-lg" ng-class="{true : 'btn-success', false : 'btn-primary'}[v]"ng-click="connect(k)">
						{{v? "Connected To" : "Connect To" }} {{k | title}}
					</button>
					<button class="btn btn-danger btn-block btn-lg" ng-click="connect('disconnect')">Disconnect</button>
				</div>
			</div>
		</div>
	</body>
</html>