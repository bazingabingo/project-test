package com.bazinga.test.algo.data.structure.linked;

/**
 * @author wangquan2564
 * @date 2021/2/20 13:44
 * @Description
 */
public class MyLinkedList<E> {

    private Node<E> first;
    private Node<E> tail;

    /** 添加元素 */
    public boolean add(E item) {
        //
        final Node<E> node = new Node<>(tail, null, item);
        tail.next = node;
        tail = node;
        return true;
    }

    public boolean remove(E item) {
        // for
        return true;
    }



    private static class Node<E>{
        E item;
        private Node prev;
        private Node next;

        Node(Node prev, Node next, E item) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }

}
