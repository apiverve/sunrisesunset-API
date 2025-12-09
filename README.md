# Sunrise Sunset API

> Sunrise Sunset is a simple tool for getting the sunrise and sunset times. It returns the sunrise and sunset times for a given location and date.

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![API Status](https://img.shields.io/badge/Status-Active-green.svg)](https://apiverve.com)
[![Method](https://img.shields.io/badge/Method-GET-blue.svg)](#)
[![Platform](https://img.shields.io/badge/Platform-Multi--Platform-orange.svg)](#installation)

**Available on:**
[![npm](https://img.shields.io/badge/npm-CB3837?style=flat&logo=npm&logoColor=white)](https://www.npmjs.com/package/@apiverve/sunrisesunset)
[![NuGet](https://img.shields.io/badge/NuGet-004880?style=flat&logo=nuget&logoColor=white)](https://www.nuget.org/packages/APIVerve.API.SunriseSunset)
[![PyPI](https://img.shields.io/badge/PyPI-3776AB?style=flat&logo=python&logoColor=white)](https://pypi.org/project/apiverve-sunrisesunset/)
[![JitPack](https://img.shields.io/badge/JitPack-2E7D32?style=flat&logo=android&logoColor=white)](#-android-jitpack)

---

## Quick Start

### Using JavaScript

```javascript
async function callSunriseSunsetAPI() {
    try {
        const params = new URLSearchParams({
            lat: 36.7201600,
            lon: -4.4203400,
            date: '12-02-2025'
        });

        const response = await fetch(`https://api.apiverve.com/v1/sunrisesunset?${params}`, {
            method: 'GET',
            headers: {
                'x-api-key': 'YOUR_API_KEY_HERE'
            }
        });

        const data = await response.json();
        console.log(data);
    } catch (error) {
        console.error('Error:', error);
    }
}

callSunriseSunsetAPI();
```

### Using cURL

```bash
curl -X GET "https://api.apiverve.com/v1/sunrisesunset?param=value" \
  -H "x-api-key: YOUR_API_KEY_HERE"
```

**Get your API key:** [https://apiverve.com](https://apiverve.com)

**📁 For more examples, see the [examples folder](./examples/)**

---

## Installation

Choose your preferred programming language:

### 📦 NPM (JavaScript/Node.js)

```bash
npm install @apiverve/sunrisesunset
```

[**View NPM Package →**](https://www.npmjs.com/package/@apiverve/sunrisesunset) | [**Package Code →**](./npm/)

---

### 🔷 NuGet (.NET/C#)

```bash
dotnet add package APIVerve.API.SunriseSunset
```

[**View NuGet Package →**](https://www.nuget.org/packages/APIVerve.API.SunriseSunset) | [**Package Code →**](./nuget/)

---

### 🐍 Python (PyPI)

```bash
pip install apiverve-sunrisesunset
```

[**View PyPI Package →**](https://pypi.org/project/apiverve-sunrisesunset/) | [**Package Code →**](./python/)

---

### 🤖 Android (JitPack)

```gradle
implementation 'com.github.apiverve:sunrisesunset-api:1.0.0'
```

[**Package Code →**](./android/)

---

## Features

✅ **Multi-platform support** - Use the same API across Node.js, .NET, Python, Android, and browsers
✅ **Simple authentication** - Just add your API key in the request header
✅ **Comprehensive documentation** - Full examples and API reference available
✅ **Production-ready** - Used by developers worldwide

---

## Documentation

📚 **Full API Documentation:** [https://docs.apiverve.com/ref/sunrisesunset](https://docs.apiverve.com/ref/sunrisesunset)

---

## Use Cases

Common use cases for the Sunrise Sunset API:

- ✅ Integration into web applications
- ✅ Mobile app development
- ✅ Data analysis and reporting
- ✅ Automation workflows
- ✅ Microservices architecture

---

## API Reference

### Authentication
All requests require an API key in the header:
```
x-api-key: YOUR_API_KEY_HERE
```

Get your API key: [https://apiverve.com](https://apiverve.com)

### Response Format
All responses are JSON with this structure:
```json
{
  "status": "ok",
  "data": { ... }
}
```

---

## Support & Community

- 💬 **Support**: [https://apiverve.com/contact](https://apiverve.com/contact)
- 🐛 **Issues**: [GitHub Issues](../../issues)
- 📖 **Documentation**: [https://docs.apiverve.com](https://docs.apiverve.com)
- 🌐 **Website**: [https://apiverve.com](https://apiverve.com)

---

## Contributing

We welcome contributions! Please see [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines.

---

## Security

For security concerns, please review our [Security Policy](SECURITY.md).

---

## License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## Acknowledgments

Built with ❤️ by [APIVerve](https://apiverve.com)

Copyright © 2025 APIVerve. All rights reserved.
