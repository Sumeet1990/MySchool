<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/cssverticalmenu.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<table style="width: 100%;height: 100%;">
    <tr>
        <td align="center" background="${pageContext.request.contextPath}/images/background_img.jpg" ><tiles:insertAttribute name="header" />
        </td>
    </tr>
    <tr style="width: 100%;height: 80%;">
        <td ><tiles:insertAttribute name="body" /></td>
    </tr>
    <tr style="bottom: 0;">
        <td style="width:100%; " background="${pageContext.request.contextPath}/images/background_img.jpg"><tiles:insertAttribute name="footer" />
        </td>
    </tr>
    
</table>
</body>
</html>