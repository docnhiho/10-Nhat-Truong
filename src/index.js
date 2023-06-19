const express = require('express') 
const app = express()
const port = 8000
const bookRouter = require('./routes/book');
const userRouter = require('./routes/user');
const childrenRouter = require('./routes/children');
const exerciesRouter = require('./routes/exercises');



app.use(express.json());
app.use(express.urlencoded({extended: true}));

app.use('/v1', bookRouter)
app.use('/v1', userRouter)
app.use('/v1', childrenRouter)
app.use('/v1', exerciesRouter)




// app.get('/message/:msg', (req,res) => {
//     let msg = req.params.msg;
//     console.log("Message: ", msg);
//     res.send('Message is sent...');
// })
// app.get('/' ,(req, res) => {res.send('Hello Worlddd')})


app.listen(port, () =>{
    console.log(`Example app listening on port ${port}`)
})
