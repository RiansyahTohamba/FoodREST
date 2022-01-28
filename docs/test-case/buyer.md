Verify that all the specified fields are present on the registration page.
Verify that the required/mandatory fields are marked with * against the field.
Verify that for better user interface dropdowns, radio buttons and checkboxes, etc fields are displayed wherever possible instead of just textboxes
Verify the page has both submit and cancel/reset buttons at the end.
Verify that clicking submits button after entering all the required fields, submits the data to the server.
Verify that clicking cancels/reset button after entering all the required fields, cancels the submit request, and reset all the fields.
Verify that whenever possible validation should take place at client side
Verify that not filling the mandatory fields and clicking the submit button will lead to validation error.

Verify that not filling the optional fields and clicking the submit button will still send data to the 
server without any validation error.

Check the upper limit of the textboxes.
Check validation on the date and email fields (only valid dates and valid email Ids should be allowed.
Check validation on numeric fields by entering alphabets and special characters.

Verify that leading and trailing spaces are trimmed.
Verify that entering blank spaces on mandatory fields leads to validation error.
Verify that after making a request to the server and then sending the same request again with the same unique key will lead to server-side validation error