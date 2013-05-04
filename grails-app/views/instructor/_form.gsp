<%@ page import="uk.ac.shu.webarch.register.Instructor" %>



<div class="fieldcontain ${hasErrors(bean: instructorInstance, field: 'instructorNo', 'error')} required">
	<label for="instructorNo">
		<g:message code="instructor.instructorNo.label" default="Instructor No" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="instructorNo" maxlength="10" required="" value="${instructorInstance?.instructorNo}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: instructorInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="instructor.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="50" required="" value="${instructorInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: instructorInstance, field: 'password', 'error')} ">
	<label for="password">
		<g:message code="instructor.password.label" default="Password" />
		
	</label>
	<g:textField name="password" value="${instructorInstance?.password}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: instructorInstance, field: 'sessions', 'error')} ">
	<label for="sessions">
		<g:message code="instructor.sessions.label" default="Sessions" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${instructorInstance?.sessions?}" var="s">
    <li><g:link controller="session" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="session" action="create" params="['instructor.id': instructorInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'session.label', default: 'Session')])}</g:link>
</li>
</ul>

</div>

