# SpringBootVersion
This is an experiment to get the application version onto a thymeleaf page.  The ultimate end goal is to have my CSS and JS files in a different project be appended with a parameter that will version them to keep them from being cached when they change.

Example:
```
<link rel="stylesheet" href="/app.css?v=1.0.27">
<script src="/app.js?v=1.0.27"></script>
```

This would allow browser caching but only for a specific version of the application.

Furthermore, when running locally, I want to disable caching all together, so I make it print a millisecond stamp.

```
<link rel="stylesheet" href="/app.css?v=1530615166407">
<script src="/app.js?v=1530615166407"></script>
```

To use in Thymeleaf:
```
<link rel="stylesheet" th:href="@{/app.css(v=${applicationVersion})}">
<script th:src="@{/app.js(v=${applicationVersion})}"></script>
```
