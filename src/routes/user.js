const express = require('express');
const router = express.Router();
const userControllers = require('../controllers/user')

router.get('/users', userControllers.getAllUser);

//find user by id
router.get('/users/:userId', userControllers.getUserById)

//find user by name and age
router.get('/getUserByNameAndAge', userControllers.getUserByNameAndAge)

//create user
router.post('/createUser', userControllers.createUser)

//create many users
router.post('/createManyUser', userControllers.createManyUser)

module.exports = router;