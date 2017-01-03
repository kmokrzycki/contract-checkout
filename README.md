# contract-checkout

## Missing test coverage! 
Within given time freame I did not manage to write any test for the code however if more time given
belo steps should be implementd:

1. Request list and make sure result comes back correctly
2. Update existing test to pass as well as make sure ther is at test for

		* one scenario where product are under offer exactly 
		* products under offer value + 1 to make sure module works 
		* no offers at all as still working 
		
## Starting the app 
```
clean compile exec:java
```
## Example request
Content of the basket is represented with a list:

```
$ curl 'http://localhost:8080/myapp/cart' -H 'Content-Type: application/json' --data-binary '{"products": [ "Apple", "Apple", "Orange", "Apple","Apple","Orange","Orange" ]}'
```
		

