# Quick Start Guide - Shopizer Documentation

This guide will help you get started with the Shopizer source code documentation.

## Overview

The documentation covers 163 key source files across 4 main modules:

- **sm-shop** (49 files) - Web application and REST API
- **sm-core** (50 files) - Core business logic and services
- **sm-core-model** (50 files) - Domain entities and models
- **sm-core-modules** (14 files) - Integration modules

## Viewing the Documentation

### Quick View (GitHub)
Simply browse the `.adoc` files in the `docs/` directory on GitHub. GitHub automatically renders AsciiDoc files.

### Build HTML Documentation

1. Install AsciiDoctor:
   ```bash
   gem install asciidoctor
   ```

2. Build the documentation:
   ```bash
   cd docs
   ./build-docs.sh
   ```

3. Open the documentation:
   ```bash
   # Linux
   xdg-open html/index.html
   
   # macOS
   open html/index.html
   
   # Windows
   start html/index.html
   ```

## Navigation

### Start Here
- [index.adoc](index.adoc) - Main documentation index with overview and links to all modules

### Browse by Module

#### sm-shop Module (Web Application)
Key entry points:
- [ShopApplication.adoc](source-docs/sm-shop/ShopApplication.adoc) - Main Spring Boot application
- [ProductFacadeImpl.adoc](source-docs/sm-shop/ProductFacadeImpl.adoc) - Product management facade
- [OrderFacadeImpl.adoc](source-docs/sm-shop/OrderFacadeImpl.adoc) - Order processing facade
- [CustomerFacadeImpl.adoc](source-docs/sm-shop/CustomerFacadeImpl.adoc) - Customer management facade

#### sm-core Module (Business Logic)
Key entry points:
- [ProductServiceImpl.adoc](source-docs/sm-core/ProductServiceImpl.adoc) - Product service
- [OrderServiceImpl.adoc](source-docs/sm-core/OrderServiceImpl.adoc) - Order service
- [CustomerServiceImpl.adoc](source-docs/sm-core/CustomerServiceImpl.adoc) - Customer service
- [ShoppingCartServiceImpl.adoc](source-docs/sm-core/ShoppingCartServiceImpl.adoc) - Shopping cart service

#### sm-core-model Module (Domain Models)
Key entry points:
- [Customer.adoc](source-docs/sm-core-model/Customer.adoc) - Customer entity
- [Order.adoc](source-docs/sm-core-model/Order.adoc) - Order entity
- [ShoppingCart.adoc](source-docs/sm-core-model/ShoppingCart.adoc) - Shopping cart entity
- [Payment.adoc](source-docs/sm-core-model/Payment.adoc) - Payment entity

#### sm-core-modules Module (Integrations)
Key entry points:
- [PaymentModule.adoc](source-docs/sm-core-modules/PaymentModule.adoc) - Payment integration
- [ShippingQuoteModule.adoc](source-docs/sm-core-modules/ShippingQuoteModule.adoc) - Shipping integration

## Documentation Structure

Each source file documentation includes:

```
= ClassName
:toc: left

== Summary
- File Path
- Package Name
- Type (class/interface/enum)
- Description

== Overview
General context and purpose

== Dependencies
- Java/JavaX imports
- Spring Framework imports
- Application imports

== Methods
Table of all public methods

== Source Code Reference
Path to original source file
```

## Searching

### By Functionality
Use the main index to find components by functionality:
- Product management
- Order processing
- Customer management
- Payment processing
- Shipping integration

### By Type
- **Controllers** - Handle HTTP requests
- **Facades** - Simplify complex operations
- **Services** - Implement business logic
- **Repositories** - Data access layer
- **Entities** - Domain models
- **Modules** - External integrations

## Examples

### Finding Product-Related Code
1. Open [index.adoc](index.adoc)
2. Navigate to "sm-shop Module" → "Product-Related Facades"
3. Click on [ProductFacadeImpl.adoc](source-docs/sm-shop/ProductFacadeImpl.adoc)

### Understanding Order Processing
1. Open [index.adoc](index.adoc)
2. Check both:
   - sm-shop → [OrderFacadeImpl.adoc](source-docs/sm-shop/OrderFacadeImpl.adoc) (API layer)
   - sm-core → [OrderServiceImpl.adoc](source-docs/sm-core/OrderServiceImpl.adoc) (Business logic)

### Exploring Domain Models
1. Open [index.adoc](index.adoc)
2. Navigate to "sm-core-model Module"
3. Browse by domain: Product, Order, Customer, Payment, etc.

## Tips

1. **Start with index.adoc** - It provides a complete overview and organized links
2. **Use the TOC** - Each document has a table of contents on the left
3. **Follow the layers** - Understand the flow: Controller → Facade → Service → Repository
4. **Check dependencies** - The "Dependencies" section shows what each component uses
5. **HTML is searchable** - Build HTML docs for full-text search capability

## Need Help?

- See the main [README.md](README.md) for detailed information
- Check the [Shopizer website](http://www.shopizer.com)
- Join the [Slack community](https://shopizer.slack.com)

## Contributing

To add or update documentation:
1. Modify source files in the repository
2. Regenerate documentation (contact maintainers for scripts)
3. Submit a pull request

---

Happy coding! 🚀
