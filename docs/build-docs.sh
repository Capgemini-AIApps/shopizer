#!/bin/bash

# Script to build HTML documentation from AsciiDoc source files
# Requires: asciidoctor (gem install asciidoctor)

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
OUTPUT_DIR="$SCRIPT_DIR/html"

# Check if asciidoctor is available
if ! command -v asciidoctor &> /dev/null; then
    echo "Error: asciidoctor is not installed"
    echo "Install it with: gem install asciidoctor"
    exit 1
fi

echo "Building Shopizer Documentation..."
echo "=================================="
echo ""

# Create output directory
mkdir -p "$OUTPUT_DIR"

# Build the main index
echo "Building index.html..."
asciidoctor "$SCRIPT_DIR/index.adoc" -o "$OUTPUT_DIR/index.html"

# Build all source documentation files
echo "Building source documentation..."

for module in sm-shop sm-core sm-core-model sm-core-modules; do
    echo "  Building $module documentation..."
    mkdir -p "$OUTPUT_DIR/source-docs/$module"
    
    find "$SCRIPT_DIR/source-docs/$module" -name "*.adoc" -type f | while read -r file; do
        basename_file=$(basename "$file" .adoc)
        asciidoctor "$file" -o "$OUTPUT_DIR/source-docs/$module/${basename_file}.html"
    done
done

echo ""
echo "Documentation built successfully!"
echo "Output directory: $OUTPUT_DIR"
echo ""
echo "Open the documentation with:"
echo "  xdg-open $OUTPUT_DIR/index.html"
echo ""
