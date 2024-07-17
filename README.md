Sunrise Sunset API
============

Sunrise Sunset is a simple tool for getting the sunrise and sunset times. It returns the sunrise and sunset times for a given location and date.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)

This is a Javascript Wrapper for the [Sunrise Sunset API](https://apiverve.com/marketplace/api/sunrisesunset)

---

## Installation
	npm install @apiverve/sunrisesunset --save

---

## Configuration

Before using the sunrisesunset API client, you have to setup your account and obtain your API Key.  
You can get it by signing up at [https://apiverve.com](https://apiverve.com)

---

## Usage

The Sunrise Sunset API documentation is found here: [https://docs.apiverve.com/api/sunrisesunset](https://docs.apiverve.com/api/sunrisesunset).  
You can find parameters, example responses, and status codes documented here.

### Setup

```
var sunrisesunsetAPI = require('@apiverve/sunrisesunset');
var api = new sunrisesunsetAPI({
    api_key: [YOUR_API_KEY],
    secure: true //(Optional, defaults to true)
});
```

---


### Perform Request
Using the API client, you can perform requests to the API.

###### Define Query

```
var query = {
  lat: 36.7201600,
  lon: -4.4203400,
  date: "07-17-2024"
};
```

###### Simple Request (using Callback)

```
api.execute(query, function (error, data) {
    if (error) {
        return console.error(error);
    } else {
        console.log(data);
    }
});
```

###### Example Response

```
{
  "status": "ok",
  "error": null,
  "data": {
    "solarNoon": "2024-07-17T12:24:56.439Z",
    "sunrise": "2024-07-17T05:13:14.585Z",
    "sunset": "2024-07-17T19:36:38.293Z",
    "sunriseEnd": "2024-07-17T05:16:14.024Z",
    "sunsetStart": "2024-07-17T19:33:38.854Z",
    "dawn": "2024-07-17T04:43:32.774Z",
    "dusk": "2024-07-17T20:06:20.104Z",
    "nauticalDawn": "2024-07-17T04:06:56.533Z",
    "nauticalDusk": "2024-07-17T20:42:56.345Z",
    "nightEnd": "2024-07-17T03:26:42.539Z",
    "night": "2024-07-17T21:23:10.338Z",
    "goldenHourEnd": "2024-07-17T05:50:46.709Z",
    "goldenHour": "2024-07-17T18:59:06.168Z"
  }
}
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact).

---

## Updates
Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms) and all legal documents and agreements.

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2024 APIVerve, and Evlar LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.