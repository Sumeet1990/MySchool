<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title></title>
	
		<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/script.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>
		
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap_common.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/formElementsStyle.css">
		
		<style>
			* { margin: 0; padding: 0; }
			body {background: #eee; /* font-family: Arial; */ font-size: 16px;}
			a { text-decoration: none;  }
		</style>
	</head>
	
	<body>
		<div id="page-wrap">
			<div id="content">
				<s:form action="" method="post" id="elements-form">
	    			<h3>Library Books</h3>
				    <div id="form-content">
						<fieldset>
							<h4>Book Details</h4>
							<br/>
							<div class="fieldgroup">
				            	<label>Category Name</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>&nbsp;
				            </div>
				            <div class="fieldgroup">
				                <label>Book Code</label>
				                <input type="text" name="staffTownDistrict"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Book Name</label>
				                <input type="text" name="staffDistrictCity"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Author Name</label>
				                <input type="text" name="staffAreaPin"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Publisher Name</label>
				                <input type="text" name="staffState"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Number Of Pages</label>
				                <input type="text" name="staffCountry"/>
				            </div>
				            
				             <div class="fieldgroup">
				                <label>Purchased Date</label>
				                <input type="text" name="staffPCNumber"/>
				            </div>
				            
				             <div class="fieldgroup">
				                <label>Book Price</label>
				                <input type="text" name="staffECNumber"/>
				            </div>
				            
				             <div class="fieldgroup">
				                <label>Price Measure</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>&nbsp;
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Book Accessories</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>&nbsp;
				            </div>
				        </fieldset>
				        <fieldset>
							<div class="fieldgroup">
				                <s:submit value="Sumbit"/>
				            </div>				           	
				        </fieldset>
				    </div>
				</s:form>
			</div>
		</div>
	</body>
</html>