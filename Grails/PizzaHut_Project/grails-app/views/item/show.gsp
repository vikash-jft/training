
<%@ page import="bootstapsetdata.Item" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'item.label', default: 'Item')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-item" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-item" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list item">
			
				<g:if test="${itemInstance?.itemName}">
				<li class="fieldcontain">
					<span id="itemName-label" class="property-label"><g:message code="item.itemName.label" default="Item Name" /></span>
					
						<span class="property-value" aria-labelledby="itemName-label"><g:fieldValue bean="${itemInstance}" field="itemName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${itemInstance?.itemColor}">
				<li class="fieldcontain">
					<span id="itemColor-label" class="property-label"><g:message code="item.itemColor.label" default="Item Color" /></span>
					
						<span class="property-value" aria-labelledby="itemColor-label"><g:fieldValue bean="${itemInstance}" field="itemColor"/></span>
				</li>
				</g:if>
			
				<g:if test="${itemInstance?.itemPic}">
				<li class="fieldcontain">
					<span id="itemPic-label" class="property-label"><g:message code="item.itemPic.label" default="Item Pic" /></span>

						<span class="property-value" aria-labelledby="itemPic-label"><g:fieldValue bean="${itemInstance}" field="itemPic"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${itemInstance?.itemPrice}">
				<li class="fieldcontain">
					<span id="itemPrice-label" class="property-label"><g:message code="item.itemPrice.label" default="Item Price" /></span>
					
						<span class="property-value" aria-labelledby="itemPrice-label"><g:fieldValue bean="${itemInstance}" field="itemPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${itemInstance?.itemSize}">
				<li class="fieldcontain">
					<span id="itemSize-label" class="property-label"><g:message code="item.itemSize.label" default="Item Size" /></span>
					
						<span class="property-value" aria-labelledby="itemSize-label"><g:fieldValue bean="${itemInstance}" field="itemSize"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${itemInstance?.itemType}">
				<li class="fieldcontain">
					<span id="itemType-label" class="property-label"><g:message code="item.itemType.label" default="Item Type" /></span>
					
						<span class="property-value" aria-labelledby="itemType-label"><g:fieldValue bean="${itemInstance}" field="itemType"/></span>
					
				</li>
				</g:if >
			</ol>
			<g:form url="[resource:itemInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${itemInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
