const ws = new WebSocket('ws://localhost:8082');

// listen to messages
ws.addEventListener("open", () => {
    console.log('We are connected');

ws.send("How are you?");

ws.addEventListener("message", ({data}) => {
    console.log(data);
});

});

document.querySelector("button").onclick = () => {
    ws.send('hello!');
};