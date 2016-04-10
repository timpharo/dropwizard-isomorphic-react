Dropwizard Isomorphic React
============================

A Dropwizard adaptation of [Winterbe spring-react-example](https://github.com/winterbe/spring-react-example)

The `CommentBox` main view is isomorphic: HTML is initially rendered on the server with Nashorn by utilizing `ReactDOMServer.renderToString`. All interactive DOM manipulations are handled by React directly in the browser.

For further explanation read this [blog post](http://winterbe.com/posts/2015/02/16/isomorphic-react-webapps-on-the-jvm/).