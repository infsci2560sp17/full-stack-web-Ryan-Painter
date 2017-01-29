# InfoSec Index

1. What is the proposed name for your Web application?
    - InfoSec Index
2. Who is the target audience for your Web application?
    - The target audience for this web application is anyone who is new to or looking for foundational information about the information security field.
3. What problem is it intended to solve for the target audience?
    - The Information Security field as a whole is quite complex, so it can be quite difficult to get accurate information on career opportunities that exist for technologists/students (other than ethical hacking). This site would provide information on job options for those looking to break into the field, resources for learning information security concepts, and a mentorship directory in which experienced members of the InfoSec community can communicate with and provide guidance to those looking for mentorship.
4. How will it meet the minimum project requirements?
    - My site will have a combination of static informational content available, API integration with social media and job search sites, and user-tailored content post-authentication in which users will be able to communicate with their mentor and vice versa.
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
    - I feel that there is a legitimate gap in this sort of content being available in a centralized location. As far as creativity in use of technologies for this project, I will do my best to implement dynamic/interactive content as I learn throughout the course; I do not have much experience thus far with web technologies other than basic HTML, so I will be sure to try to use the skills acquired during this course to be creative with the features I include.

## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-Ryan-Painter)

## Changelog

[Changelog](CHANGELOG.md)

## Web Site

https://fast-shore-81408.herokuapp.com

## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.