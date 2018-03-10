## Running the application in a local sandbox
You'll need
* JDK 1.8 or above
* Maven 3.2 or above

Just `mvn package` the project and run the generated war artifact using `java -jar` command, or you can deploy the generated artifact to a Servlet 3.0+ container.

## Assumptions
* I'm assuming that query parameters in the first link in the exercise, namely *scenario*, *page*, *uid* and *productType* are fixed and I shouldn't manipulate their values nor extract information from them and show them to the end-user.
* I'm assuming that *offerInfo* and *userInfo* fields in JSON response are not important for my application, so I won't process their values and I won't pass a query parameter inferred from them like *siteId*.