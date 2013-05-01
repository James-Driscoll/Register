<%@ page import="uk.ac.shu.webarch.register.Student" %>



<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentNo', 'error')} required">
	<label for="studentNo">
		<g:message code="student.studentNo.label" default="Student No" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="studentNo" maxlength="10" required="" value="${studentInstance?.studentNo}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="student.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="50" required="" value="${studentInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'comment', 'error')} ">
	<label for="comment">
		<g:message code="student.comment.label" default="Comment" />
		
	</label>
	<g:textField name="comment" value="${studentInstance?.comment}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'courses', 'error')} ">
	<label for="courses">
		<g:message code="student.courses.label" default="Courses" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${studentInstance?.courses?}" var="c">
    <li><g:link controller="enrollment" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="enrollment" action="create" params="['student.id': studentInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'enrollment.label', default: 'Enrollment')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'regEntries', 'error')} ">
	<label for="regEntries">
		<g:message code="student.regEntries.label" default="Reg Entries" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${studentInstance?.regEntries?}" var="r">
    <li><g:link controller="registerEntry" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="registerEntry" action="create" params="['student.id': studentInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'registerEntry.label', default: 'RegisterEntry')])}</g:link>
</li>
</ul>

</div>

