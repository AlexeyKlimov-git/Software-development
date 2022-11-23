const WebSocket = require('ws');
const server = new WebSocket.Server({port: 8082})


server.on('connection', ws => { // handshake and access to ws object
    console.log("New client connected!");
    

    ws.on("message", data => {
        console.log(`Client has sent us: ${data}`);

        ws.send(data.toUpperCase());
    });    
    
    ws.on('close', () => { 
        console.log("Client has disconnected!")
    });
});



// Cons: this method does not emit to all clients
// for broadcasting functionality Socket.io can be used