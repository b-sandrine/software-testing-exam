import App from "../App";

describe('App component tests', () => {
    it('should mount the component', () => {
        cy.mount(<App />)
    })

    it('should check the data in button 1', () => {
        cy.mount(<App />)
        cy.get('button')
    })


})