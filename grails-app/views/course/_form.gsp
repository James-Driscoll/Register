<%@ page import="uk.ac.shu.webarch.register.Course" %>



<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'courseCode', 'error')} required">
	<label for="courseCode">
		<g:message code="course.courseCode.label" default="Course Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="courseCode" maxlength="10" required="" value="${courseInstance?.courseCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="course.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="50" required="" value="${courseInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="course.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${courseInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: courseInstance, field: 'sessions', 'error')} ">
	<label for="sessions">
		<g:message code="course.sessions.label" default="Sessions" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${courseInstance?.sessions?}" var="s">
    <li><g:link controller="session" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="session" action="create" params="['course.id': courseInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'session.label', default: 'Session')])}</g:link>
</li>
</ul>

</div>

