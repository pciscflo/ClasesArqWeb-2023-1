package com.upc.ejercicio2;
@FunctionalInterface
public interface FigInterface<P, T, U, V> {
    P getCondition(T a, U b, V c);
}
