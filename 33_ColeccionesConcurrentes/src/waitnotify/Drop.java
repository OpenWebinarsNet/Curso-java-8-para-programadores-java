package waitnotify;

public class Drop {
	// Mensaje enviado por el productor al consumidor
    private String message;
    // True if consumer should wait
    // for producer to send message,
    // false if producer should wait for
    // consumer to retrieve message.
    
    // Verdadero si el consumidor debe esperar a que el productor envíe un mensaje
    // Falso si el productor debe esperar a que el consumidor tome el mensaje
    private boolean empty = true;

    public synchronized String take() {
    	
    	// Esperamos a que esté disponible
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        // Modificamos el estado
        empty = true;
        // Notificamos al productor que el estado ha cambiado
        notifyAll();
        return message;
    }

    public synchronized void put(String message) {
        // Esperamos a que el mensaje haya sido leído
        while (!empty) {
            try { 
                wait();
            } catch (InterruptedException e) {}
        }
        // Cambiamos el estado
        empty = false;
        // Almacenamos el mensaje
        this.message = message;
              
        // Notificamos al consumidor que el estado ha cambiado.
        notifyAll();
    }
}