const express = require('express')
const router = express.Router();

const childrenController = require('../controllers/children');


router.post('/children', childrenController.sendData);
router.get("/children",childrenController.data)
router.get("/children/children-by-country", childrenController.getCountry)
module.exports = router;