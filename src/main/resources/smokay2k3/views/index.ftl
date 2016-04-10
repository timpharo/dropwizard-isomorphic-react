<#-- @ftlvariable name="" type="uk.co.lgm.IndexView" -->
<html>
    <head>
        <title>Hello React</title>
        <script type="text/javascript" src="static/vendor/react.js"></script>
        <script type="text/javascript" src="static/vendor/react-dom.js"></script>
        <script type="text/javascript" src="static/vendor/react-dom-server.js"></script>
        <script type="text/javascript" src="static/vendor/jquery.js"></script>
    </head>
    <body>
        <div id="content">${content}</div>
        <script type="text/javascript" src="static/commentBox.js"></script>
        <script type="text/javascript">
            $(function () {
                renderClient(${data});
            });
        </script>
    </body>
</html>