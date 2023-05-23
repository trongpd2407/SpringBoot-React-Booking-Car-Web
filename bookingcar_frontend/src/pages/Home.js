import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min.js'
import './home.css'
import React, { useEffect, useState } from 'react'
import axios from 'axios'
import { Link } from 'react-router-dom'

export default function Home() {
    const [cars,setCars] = useState([])
    useEffect(()=>{
        loadUsers()
    },[])
    const loadUsers = async ()=>{
        const result = await axios.get("http://localhost:8080/home")
        setCars(result.data)
    }
    const [query1,setQuery1] = useState("")
    const [query2,setQuery2] = useState("")
  
 
  return (
    <div>
      <div className='container mt-5 border' id='car'>
        <h6>Tìm kiếm bằng địa điểm khởi hành và điểm đến</h6>
        <input className="col mx-2 mb-4" type="text" placeholder='Start Des' onChange={(e)=>setQuery1(e.target.value)}></input>
        <input className='col mx-2 mb-4' type="text" placeholder='Stop Des' onChange={(e)=>setQuery2(e.target.value)}></input>
      </div>
      
      {cars.filter((car)=> {

        if(query1.toLowerCase()==='' || query2.toLowerCase()==='') return car
        else return car.startDes.toLowerCase().includes(query1) && car.stopDes.toLowerCase().includes(query2)
       
      }).map((car)=>(
      <div className='container mt-3 border' id='car'>
        <div className="row no-gutters">
       
          <div className="col-md-3">
            <img key={car.idCar} src={`./${car.image}`} className="card-img" alt="..." />
          </div>
          <div className="col ">
            <div className="card-body">
              <h5 className="card-title mb-4">{car.carName}</h5>
              <div className='row'>
                <div className='col'>
                  <p className="card-text">Start Time : {car.startTime}</p>
                  <p className="card-text">Start Des : {car.startDes}</p></div>
                <div className='col'>
                  <p className="card-text"> Stop Time: {car.stopTime}</p>
                  <p className="card-text">Stop Des: {car.stopDes}</p>
                </div>
              </div>
            </div>
          </div>
          <div className="col">
            <div className="card-body">
              <h5 className="card-title mb-4">Gia ve: {car.price} đ</h5>
              <div className='row'>
                  <p className="card-text">So DT Nha Xe: {car.phonenumber}</p>
                  <p className="card-text">So Ghe Ngoi: {car.numberOfSeats}</p>
                  <p className="card-text">So Ghe Con Trong: {car.numberOfSeatsNA}</p>
                  <Link className='btn btn-dark' to ={'/booking_car'}>Dat Ve</Link>
                
              </div>
            </div>
          </div>
        </div>
      </div>
      ))}
    </div>
  )
}
