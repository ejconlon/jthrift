package jthrift;

import java.util.*;

public class ScannerIterator implements Iterator<java_cup.runtime.Symbol>, Iterable<java_cup.runtime.Symbol> {

    public static ScannerIterator fromReader(java.io.Reader in) {
        YYLexer yylexer = new YYLexer(in);
        return new ScannerIterator(yylexer);
    }

    public static ScannerIterator fromInputStream(java.io.InputStream in) {
        YYLexer yylexer = new YYLexer(in);
        return new ScannerIterator(yylexer);
    }

    private final java_cup.runtime.Scanner scanner;
    private java_cup.runtime.Symbol cached;

    public ScannerIterator(java_cup.runtime.Scanner scanner) {
        this.scanner = scanner;
    }

    public Iterator<java_cup.runtime.Symbol> iterator() {
        return this;
    }

    public java_cup.runtime.Symbol next() {
        if (cached != null) {
            java_cup.runtime.Symbol uncached = cached;
            cached = null;
            return uncached;
        } else {
            try {
                java_cup.runtime.Symbol uncached = scanner.next_token();
                if (uncached.sym_num() == YYParser.EOF) {
                    throw new NoSuchElementException("");
                }
                return uncached;
            } catch (java.io.IOException e) {
                throw new NoSuchElementException(e.toString());
            }
        }
    }

    public boolean hasNext() {
        if (cached != null) return true;
        else {
            try {
                cached = scanner.next_token();
                if (cached.sym_num() == YYParser.EOF) {
                    cached = null;
                    return false;
                } else {
                    return true;
                }
            } catch (java.io.IOException e) {
                return false;
            }
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}