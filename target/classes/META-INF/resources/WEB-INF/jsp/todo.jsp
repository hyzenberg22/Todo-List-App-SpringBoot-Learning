<!-- heaader added  -->
<%@ include file="common/header.jspf" %>
<!-- navbar added -->
<%@ include file="common/navigation.jspf" %>
	<div class="container">
		<h1>Enter To do Details</h1>
		<form:form method="post" modelAttribute="todo">
			<!-- fieldset is to group the same fields  -->
			<fieldset class="mb-3">
				<form:label path="description">Description</form:label>
				<form:input type="text" path="description" required="required" />
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>

			<fieldset class="mb-3">
				<form:label path="description">Target Date</form:label>
				<form:input type="text" path="targetdate" required="required" />
				<form:errors path="targetdate" cssClass="text-warning" />
			</fieldset>

			<form:input type="hidden" path="id" />
			<form:input type="hidden" path="done" />
			<input type="submit" class="btn-info" />
		</form:form>
	</div>
<!-- include the footer file  importing form the footer.jspf-->
<%@ include file="common/footer.jspf" %>
<script type="text/javascript">
	$('#targetdate').datepicker({
		format: 'yyyy-mm-dd'
	});
</script>