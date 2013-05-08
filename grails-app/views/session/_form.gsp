<%@ page import="uk.ac.shu.webarch.register.Session" %>



<div class="fieldcontain ${hasErrors(bean: sessionInstance, field: 'sessionCode', 'error')} required">
	<label for="sessionCode">
		<g:message code="session.sessionCode.label" default="Session Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="sessionCode" maxlength="50" required="" value="${sessionInstance?.sessionCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: sessionInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="session.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="150" required="" value="${sessionInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: sessionInstance, field: 'course', 'error')} required">
	<label for="course">
		<g:message code="session.course.label" default="Course" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="course" name="course.id" from="${uk.ac.shu.webarch.register.Course.list()}" optionKey="id" required="" value="${sessionInstance?.course?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: sessionInstance, field: 'instructor', 'error')} required">
	<label for="instructor">
		<g:message code="session.instructor.label" default="Instructor" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="instructor" name="instructor.id" from="${uk.ac.shu.webarch.register.Instructor.list()}" optionKey="id" required="" value="${sessionInstance?.instructor?.id}" class="many-to-one"/>
</div>

