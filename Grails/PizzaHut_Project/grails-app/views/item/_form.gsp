<%@ page import="bootstapsetdata.Item" %>



<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'itemName', 'error')} required">
	<label for="itemName">
		<g:message code="item.itemName.label" default="Item Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="itemName" required="" value="${itemInstance?.itemName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'itemColor', 'error')} required">
	<label for="itemColor">
		<g:message code="item.itemColor.label" default="Item Color" />
		%{--<span class="required-indicator">*</span>--}%
	</label>
	<g:textField name="itemColor" value="${itemInstance?.itemColor}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'itemPic', 'error')} required">
	<label for="itemPic">
		<g:message code="item.itemPic.label" default="Upload Pic" />
		<span class="required-indicator">*</span>
	</label>
	%{--<g:textField type="file" name="itemPic" required="" value="${itemInstance?.itemPic}"/>--}%
	<input type="file" name="itemPic" required="" value="${itemInstance?.itemPic}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'itemPrice', 'error')} required">
	<label for="itemPrice">
		<g:message code="item.itemPrice.label" default="Item Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="itemPrice" type="number" value="${itemInstance.itemPrice}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'itemSize', 'error')} required">
	<label for="itemSize">
		<g:message code="item.itemSize.label" default="Item Size" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="itemSize" required="" value="${itemInstance?.itemSize}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'itemType', 'error')} required">
	<label for="itemType">
		<g:message code="item.itemType.label" default="Item Type" />
		<span class="required-indicator">*</span>
	</label>
	<select name="itemType" >
		<option value="Veg">Veg</option>
		<option value="Non-Veg">Non-Veg</option>
	</select>

	%{--<g:textField name="itemType" required="" value="${itemInstance?.itemType}"/>--}%
</div>
