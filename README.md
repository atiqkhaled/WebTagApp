# WebTagApp
This tag app is about loop features over html content.
Key project resources given bellow :

- SuperManOptionalTag.java
- taglib.tld
- test.jsp

** _SuperManOptionalTag_ ** java class is a tag handler in which loop fetaures is implemented.

** _taglib.tld_ ** is a tag library descriptors file. Tag name, qualified class name , attributes and other
element related to tag handler has been defined in taglib.tld file.

** _test.jsp_ ** is the sample jsp file where superman loop tag been used.
You can find `superman:loop` tag with count attribute which indicates how many times iterate over specified html content.

Following code sinnipet specifies superman loop tag :

```
<superman:loop count = "3">
  Hello world!
</superman:loop>
```

**Note :** Developers can implement superman loop tag on their web project using `supertag-1.0.jar` file which is located in  `../WEB-INF/lib/supertag-1.0.jar`. All you have to do just reference this jar file from web.xml.

Thanks.
