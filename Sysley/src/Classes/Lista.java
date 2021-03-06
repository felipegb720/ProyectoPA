/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author rodri
 */
public class Lista<E> implements ListInt<E> {
	
	public static final int CAPACITY=16;
	private E[ ] data;
	private int size = 0;
	//private int contCapacidad = 0; 
        
	public Lista() {
		this(CAPACITY);
	}

	public Lista(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() { 
		return size == 0;
	}

	public E get(int i) {
		checkIndex(i, size);
		return data[i];
	}

	public E set(int i, E e) {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	public void add(int i, E e) {                 
		//checkIndex(i, size);
		if (size >= data.length) // not enough capacity
			throw new IllegalStateException("Array is full");
                else{
                   for (int k=0; k <= i; k++) {
                   if (data[k]== null) {
                       data[k] =e;
                       size++;                       
                   }
                       
                   }// start by shifting rightmost
		//	data[k+1] = data[k];
		//data[i] = e; // ready to place the new element size++;  
               
                }
		
		
	}

	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for (int k=i; k < size-1; k++)
			data[k] = data[k+1];
		data[size-1] = null;
		size--;
		return temp;
	}
	
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i <= 0 || i >= n)
		throw new IndexOutOfBoundsException("Illegal index: " + i);
	}

   // public int getContCapacidad() {
    //    return contCapacidad;
    //}

}