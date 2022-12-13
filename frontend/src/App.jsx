import { useState } from 'react'
import './App.css'

function App() {
  const [value, setValue] = useState('0')

  function handleClick(e) {
    e.preventDefault()
    setValue(
      e.target.value
    )
  }

  return (
    <div className="App">
      <div className="cont">
        <div className="calsi">
          <h1>Calculator</h1>
          <input type="text" id="inp" placeholder={value} readonly="" className='input'/>
          <div className="btns">
            <button onClick={handleClick} value="0">0</button>
            <button onClick={handleClick} value="1">1</button>
            <button onClick={handleClick} value="2">2</button>
            <button onClick={handleClick} value="3">3</button>
            <button onClick={handleClick} value="4">4</button>
            <button onClick={handleClick} value="5">5</button>
            <button onClick={handleClick} value="6">6</button>
            <button onClick={handleClick} value="7">7</button>
            <button onClick={handleClick} value="8">8</button>
            <button onClick={handleClick} value="9">9</button>
            <button onClick={handleClick} value="+">+</button>
            <button onClick={handleClick} value="-">-</button>
            <button onClick={handleClick} value="/">/</button>
            <button onClick={handleClick} value="*">*</button>
          </div>
          <button onClick="exe()">=</button>
          <button onClick="cancel()">⌫</button>
          <button onClick="cls()">c</button>
        </div>
      </div>
    </div>
  )
}

export default App
