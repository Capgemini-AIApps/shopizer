# Shopizer Source Code Documentation

This directory contains retro-documentation for the Shopizer e-commerce platform source code in AsciiDoc format.

## Overview

The documentation is organized by module and provides comprehensive coverage of key source files across the entire codebase. Each source file has a corresponding `.adoc` file that documents its structure, dependencies, and functionality.

## Structure

```
docs/
├── index.adoc                 # Main documentation index
├── README.md                  # This file
└── source-docs/              # Module-specific documentation
    ├── sm-shop/              # Web application module (49 files)
    ├── sm-core/              # Core business logic module (50 files)
    ├── sm-core-model/        # Domain model module (50 files)
    └── sm-core-modules/      # Integration modules (14 files)
```

## Statistics

- **Total documented files**: 163
- **Modules covered**: 4
- **Documentation format**: AsciiDoc

## Viewing the Documentation

### Option 1: View as Plain Text
The `.adoc` files can be read as plain text in any text editor.

### Option 2: Render AsciiDoc
To render the AsciiDoc files, you can use:

#### Using AsciiDoctor (Recommended)

Install AsciiDoctor:
```bash
gem install asciidoctor
```

Render to HTML:
```bash
asciidoctor docs/index.adoc -o docs/index.html
```

Render all documentation:
```bash
find docs/source-docs -name "*.adoc" -exec asciidoctor {} \;
```

#### Using Online Viewers
- Upload `.adoc` files to: https://asciidoclive.com/
- Use VS Code with the "AsciiDoc" extension

#### Using Docker
```bash
docker run -v $(pwd)/docs:/documents/ asciidoctor/docker-asciidoctor \
  asciidoctor index.adoc
```

### Option 3: GitHub Rendering
GitHub automatically renders `.adoc` files when viewing them in the repository.

## Documentation Format

Each source file documentation includes:

1. **Summary**
   - File path
   - Package name
   - Type (class, interface, enum)
   - Description (from JavaDoc if available)

2. **Overview**
   - General context about the component

3. **Dependencies**
   - Java/JavaX imports
   - Spring Framework imports
   - Application-specific imports

4. **Methods**
   - Table of methods with visibility, return type, and name

5. **Source Code Reference**
   - Path to original source file

## Module Descriptions

### sm-shop Module
The main web application module containing:
- REST API controllers
- Facade implementations
- Security configurations
- Application entry point

### sm-core Module
Core business logic containing:
- Service implementations
- Repository interfaces
- Business process logic
- Helper utilities

### sm-core-model Module
Domain model containing:
- JPA entity classes
- Enumerations
- Criteria classes
- Domain objects

### sm-core-modules Module
Integration modules containing:
- Shipping integration
- Payment integration
- Utility modules
- External service interfaces

## Getting Started

1. Start with the [index.adoc](index.adoc) file for an overview
2. Navigate to specific modules in `source-docs/`
3. Each `.adoc` file corresponds to a Java source file

## Examples

### View the main application class:
```
docs/source-docs/sm-shop/ShopApplication.adoc
```

### View a facade implementation:
```
docs/source-docs/sm-shop/ProductFacadeImpl.adoc
```

### View a domain model:
```
docs/source-docs/sm-core-model/Product.adoc
```

### View an integration module:
```
docs/source-docs/sm-core-modules/PaymentModule.adoc
```

## Contributing

To update or expand this documentation:

1. Modify the source files in the repository
2. Regenerate documentation using the generation scripts
3. Update the index.adoc file if needed
4. Commit and push changes

## License

This documentation is part of the Shopizer project and is licensed under the Apache License 2.0.
