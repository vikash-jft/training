<%@ page import="bootstapsetdata.Project" %>



<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'job', 'error')} required">
	<label for="job">
		<g:message code="project.job.label" default="Job" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="job" required="" value="${projectInstance?.job}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: projectInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="project.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${projectInstance?.name}"/>

</div>

